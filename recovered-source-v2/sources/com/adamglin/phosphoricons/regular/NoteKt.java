package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Note.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Note", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getNote", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_note", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoteKt {
    private static ImageVector _note;

    public static final ImageVector getNote(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _note;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Note", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(96.0f, 104.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 136.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(96.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 152.0f);
        pathBuilder.lineTo(96.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.lineTo(224.0f, 156.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 219.31f, 168.0f);
        pathBuilder.lineTo(168.0f, 219.31f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 156.69f, 224.0f);
        pathBuilder.lineTo(48.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder.lineTo(208.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 208.0f);
        pathBuilder.lineTo(152.0f, 208.0f);
        pathBuilder.lineTo(152.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.lineTo(208.0f, 48.0f);
        pathBuilder.lineTo(48.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 168.0f);
        pathBuilder.verticalLineToRelative(28.7f);
        pathBuilder.lineTo(196.69f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _note = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
