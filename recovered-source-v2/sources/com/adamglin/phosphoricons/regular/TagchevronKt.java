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

/* compiled from: Tagchevron.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TagChevron", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTagChevron", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tagChevron", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TagchevronKt {
    private static ImageVector _tagChevron;

    public static final ImageVector getTagChevron(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _tagChevron;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TagChevron", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.66f, 123.56f);
        pathBuilder.lineTo(201.0f, 55.12f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 187.72f, 48.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.66f, 12.44f);
        pathBuilder.lineTo(70.39f, 128.0f);
        pathBuilder.lineToRelative(-45.0f, 67.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 208.0f);
        pathBuilder.horizontalLineTo(187.72f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 201.0f, 200.88f);
        pathBuilder.lineToRelative(45.63f, -68.44f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 246.66f, 123.56f);
        pathBuilder.close();
        pathBuilder.moveTo(187.72f, 192.0f);
        pathBuilder.horizontalLineTo(47.0f);
        pathBuilder.lineToRelative(39.71f, -59.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -8.88f);
        pathBuilder.lineTo(47.0f, 64.0f);
        pathBuilder.horizontalLineTo(187.72f);
        pathBuilder.lineToRelative(42.67f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tagChevron = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
