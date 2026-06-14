package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Musicnotesminus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MusicNotesMinus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMusicNotesMinus", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_musicNotesMinus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MusicnotesminusKt {
    private static ImageVector _musicNotesMinus;

    public static final ImageVector getMusicNotesMinus(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _musicNotesMinus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MusicNotesMinus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(176.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 88.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(32.06f, 32.06f, 0.0f, true, true, -8.0f, -21.13f);
        pathBuilder.lineTo(204.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 164.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 204.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 107.12f);
        pathBuilder.lineTo(84.0f, 196.0f);
        pathBuilder.arcToRelative(32.06f, 32.06f, 0.0f, true, true, -8.0f, -21.13f);
        pathBuilder.lineTo(76.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -3.88f);
        pathBuilder.lineToRelative(56.0f, -14.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 137.0f, 45.88f);
        pathBuilder.lineTo(84.0f, 59.12f);
        pathBuilder.lineTo(84.0f, 98.88f);
        pathBuilder.lineToRelative(75.0f, -18.76f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 161.0f, 87.88f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 196.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 76.0f, 196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _musicNotesMinus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
