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

/* compiled from: Club.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Club", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getClub", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_club", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClubKt {
    private static ImageVector _club;

    public static final ImageVector getClub(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _club;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Club", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 92.0f);
        pathBuilder.arcToRelative(52.88f, 52.88f, 0.0f, false, false, -8.26f, 0.65f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, -95.48f, 0.0f);
        pathBuilder.arcTo(52.88f, 52.88f, 0.0f, false, false, 72.0f, 92.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, 31.38f, 93.48f);
        pathBuilder.lineTo(92.17f, 222.85f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 228.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.83f, -5.15f);
        pathBuilder.lineToRelative(-11.21f, -37.37f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, false, 184.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 188.0f);
        pathBuilder.arcToRelative(43.92f, 43.92f, 0.0f, false, true, -36.73f, -19.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.17f, 3.36f);
        pathBuilder.lineTo(154.62f, 220.0f);
        pathBuilder.lineTo(101.38f, 220.0f);
        pathBuilder.lineToRelative(14.52f, -48.41f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.17f, -3.36f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, -21.91f, -65.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.66f, -6.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 73.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.66f, 6.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, true, true, 184.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _club = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
